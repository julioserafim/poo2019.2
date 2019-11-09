package br.com.ufc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.ufc.dao.AlunoDAO;
import br.com.ufc.model.Aluno;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textField_Cpf;
	private JTextField textField_Curso;
	private JTextField textField_Idade;
	private AlunoDAO alunoDAO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAluno frame = new TelaCadastroAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		
		textField_Cpf = new JTextField();
		textField_Cpf.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso:");
		
		textField_Curso = new JTextField();
		textField_Curso.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		
		textField_Idade = new JTextField();
		textField_Idade.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alunoDAO = new AlunoDAO();
				Aluno aluno = new Aluno();
				aluno.setNome(textFieldNome.getText());
				aluno.setCpf(textField_Cpf.getText());
				aluno.setCurso(textField_Curso.getText());
				aluno.setIdade(Integer.parseInt(textField_Idade.getText()));
				alunoDAO.adicionarAluno(aluno);
				alunoDAO.imprimirLista();
				JOptionPane.showMessageDialog(contentPane, "Aluno adicionado com sucesso!");
			}
		});
		
		JButton btnListagem = new JButton("Listagem");
		btnListagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListagemAluno telaListagem = new TelaListagemAluno();
				telaListagem.setVisible(true);
			}	
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblIdade)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_Idade))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblCurso)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_Curso))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNome)
										.addComponent(lblCpf))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_Cpf)
										.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(btnCadastrar)
							.addGap(18)
							.addComponent(btnListagem)))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCpf)
						.addComponent(textField_Cpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurso)
						.addComponent(textField_Curso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdade)
						.addComponent(textField_Idade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar)
						.addComponent(btnListagem))
					.addGap(25))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
