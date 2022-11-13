import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BankGui {
	private JFrame mainBankWindow;
	private JLabel lblAccounts, lblAmount, lblReport;
	private JComboBox cboAccounts;
	private JTextField txtAmount;
	private JButton btnDeposit, btnWithdraw, btnOpenWindow;
	private JTextArea txtTextBlob;
	
	private JFrame frmChildWindow;
	
	private Bank bank;
	
	public BankGui() {
		bank = new Bank();
		buildMainBankWindow();
	}
	
	private void buildMainBankWindow() {
		mainBankWindow = new JFrame("Welcome to CMPINF 401 Bank");
		mainBankWindow.setBounds(20, 20, 500, 500);
		mainBankWindow.setLayout(null);
		
		// Add a label
		lblAccounts = new JLabel("Accounts: ");
		lblAccounts.setBounds(10, 10, 80, 30);
		mainBankWindow.getContentPane().add(lblAccounts);
		
		// Add a combo box with a list of accounts
		
		cboAccounts = new JComboBox(bank.getAccounts().toArray());
		cboAccounts.setBounds(lblAccounts.getX() + lblAccounts.getWidth(), lblAccounts.getY(), 150, 30);
		mainBankWindow.getContentPane().add(cboAccounts);
		
		// Add a textbox for withdrawal and deposit amounts
		lblAmount = new JLabel("Amount: ");
		lblAmount.setBounds(lblAccounts.getX(), lblAccounts.getY() + lblAccounts.getHeight() + 10, lblAccounts.getWidth(), lblAccounts.getHeight());
		mainBankWindow.getContentPane().add(lblAmount);
		
		txtAmount = new JTextField("0");
		txtAmount.setBounds(lblAmount.getX() + lblAmount.getWidth(), lblAmount.getY(), 150, 30);
		mainBankWindow.getContentPane().add(txtAmount);
		
		// Add buttons
		btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(txtAmount.getX(), txtAmount.getY() + txtAmount.getHeight() + 10, 100, 30);
		mainBankWindow.getContentPane().add(btnDeposit);
		
		btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(btnDeposit.getX() + btnDeposit.getWidth() + 5, btnDeposit.getY(), 100, 30);
		mainBankWindow.getContentPane().add(btnWithdraw);
		
		// Add report label
		lblReport = new JLabel("");
		lblReport.setBounds(btnDeposit.getX(), btnDeposit.getY() + btnDeposit.getHeight() + 10, 300, 200);
		mainBankWindow.getContentPane().add(lblReport);
		
		btnOpenWindow = new JButton("Open child window");
		btnOpenWindow.setBounds(mainBankWindow.getX(), mainBankWindow.getY() + mainBankWindow.getHeight() - 100, 150, 30);
		mainBankWindow.getContentPane().add(btnOpenWindow);
		
		// Add event handlers
		btnDeposit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedAccountNumber = cboAccounts.getSelectedItem().toString();
				Account selectedAccount = bank.findAccountByID(selectedAccountNumber);
				Double amount = Double.parseDouble(txtAmount.getText());
				selectedAccount.deposit(amount);
				lblReport.setText("Updated balance is $" + selectedAccount.getBalance());
				
			}
		});
		
		btnWithdraw.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedAccountNumber = cboAccounts.getSelectedItem().toString();
				Account selectedAccount = bank.findAccountByID(selectedAccountNumber);
				Double amount = Double.parseDouble(txtAmount.getText());
				selectedAccount.withdraw(amount);
				lblReport.setText("Updated balance is $" + selectedAccount.getBalance());
				
			}
		});
		
		btnOpenWindow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				createChildWindow();
				
			}
		});
		
		mainBankWindow.setVisible(true);
		
	}
	
	private void createChildWindow() {
		frmChildWindow = new JFrame("Child Window");
		frmChildWindow.setBounds(mainBankWindow.getX() + 20, mainBankWindow.getY() + 20, 400, 300);
		
		
		txtTextBlob = new JTextArea();
		txtTextBlob.setBounds(10, 10, 200, 100);
		frmChildWindow.getContentPane().add(txtTextBlob);
		
		String selectedAccountNumber = cboAccounts.getSelectedItem().toString();
		Account selectedAccount = bank.findAccountByID(selectedAccountNumber);
		txtTextBlob.setText(selectedAccount.getAccountNumber() + ": " + selectedAccount.getBalance());
		
		frmChildWindow.setVisible(true);
	}
	
}
