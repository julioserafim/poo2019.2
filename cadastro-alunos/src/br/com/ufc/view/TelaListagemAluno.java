package br.com.ufc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.ufc.dao.AlunoDAO;
import br.com.ufc.model.Aluno;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaListagemAluno extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private AlunoDAO alunoDAO;
	private JButton btnNewButton;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListagemAluno frame = new TelaListagemAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
	
	public void listarDadosNaTabela() {
	    
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object rowData[] = new Object[4];
        alunoDAO = new AlunoDAO();
        
        List<Aluno> alunos = alunoDAO.retornarListaDeAlunos();
        System.out.println("Tamanho lista:" + alunos.size());
        for(int i = 0; i < alunos.size(); i++) {
        
            rowData[0] = alunos.get(i).getNome();
            rowData[1] = alunos.get(i).getCpf();
            rowData[2] = alunos.get(i).getCurso();
            rowData[3] = alunos.get(i).getIdade();
            model.addRow(rowData);
        }
	}
	/**
	 * Create the frame.
	 */
	public TelaListagemAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		btnNewButton = new JButton("Excluir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Linha selecionada" + table.getSelectedRow()); 
				int indice = table.getSelectedRow();
	        if(table.getSelectedRow() != -1){
		            DefaultTableModel dtmAlunos = (DefaultTableModel) table.getModel();
		            dtmAlunos.removeRow(table.getSelectedRow());
		            alunoDAO = new AlunoDAO();
		            alunoDAO.removerAluno(indice);
	        }else{
	            JOptionPane.showMessageDialog(null,"Selecione um produto para Excluir");
	        }
			
				
			}
		});
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DefaultTableModel dtmAlunos = (DefaultTableModel) table.getModel();
				int rowCount = dtmAlunos.getRowCount();
				//remove todas as linhas da tabela
				for (int i = rowCount - 1; i >= 0; i--) {
				    dtmAlunos.removeRow(i);
				}
				
				listarDadosNaTabela();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAtualizar))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnAtualizar))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "CPF", "Curso", "Idade"
			}
		));
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		
		listarDadosNaTabela();
	}
}
