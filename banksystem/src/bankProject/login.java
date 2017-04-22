package bankProject;

	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class login {
	public boolean validate_login(String accountType, String idColumn, int account_Number, String password) {	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{           	
			con = dbConnection.getConnection();
		   	stmt = con.createStatement();
		   	rs = stmt.executeQuery("Select * from " + accountType + " Where " + idColumn + "='" + account_Number + "' and BINARY password='" + password + "'");	
                     	
	       	if(rs.next()) { 
	           	return true;    	
	       	}else{
	           	return false;  
	       	}
		} catch (SQLException e){
			System.err.println("New customer was not created");
		   	return false;
		} catch(Exception e){	
			return false;
		} finally{
			dbConnection.closeRs(rs);
			dbConnection.closeStmt(stmt);
			dbConnection.closeCon(con);
	   }  	
	}
}









//public int accountChoice(int customerID){
//	int mainAccountNumber = 0;
//	try{
//		Connection con = dbConnection.getConnection();
//		Statement stmt = con.createStatement();
//		
//		ResultSet rs = stmt.executeQuery("Select a.accountNumber, b.accountType, a.balance, a.overdraft "
//				+ "from accountstbl a "
//				+ "join accounttypetbl b on a.accountType = b.accountTypeId "
//				+ "where customerID = '" + customerID + "'");
//		
//		List<Integer> listAccountNumber = new ArrayList<Integer>();
//		List<String> listAccountType = new ArrayList<String>();
//		List<Double> listBalance = new ArrayList<Double>();
//		List<Double> listOverdraft = new ArrayList<Double>();
//		
//		int count = 0;
//		int accountNumberIndex = 0;
//		while(rs.next()){		
//			listAccountNumber.add(rs.getInt("accountNumber"));
//			listAccountType.add(rs.getString("accountType"));
//			listBalance.add(rs.getDouble("balance"));
//			listOverdraft.add(rs.getDouble("overdraft"));
//			count++;
//		}
//		if(count == 0){
//			mainAccountNumber = 0;
//		}else{
//			System.out.println("Index" + "\t" + "Account Number" + "\t" + "Account Type" + "\t\t" + "Balance" + "\t\t" + "Overdraft");
//			System.out.println("--------------------------------------------------------------------");
//			int index = 1;
//			for(int i = 0; i < listAccountNumber.size(); i++) {
//				System.out.println("[" + index + "]" + "\t" + listAccountNumber.get(i) + "\t" + listAccountType.get(i) + "\t\t" + "\u00A3" + listBalance.get(i) + "\t\t" + "\u00A3" + listOverdraft.get(i));
//				index++;
//			}
//			
//			System.out.println("");
//					
//			while(accountNumberIndex < 1 || accountNumberIndex > count){
//				accountNumberIndex = valid.getIntegerInput("Which account would you like to use:");
//			}
//			accountNumberIndex = accountNumberIndex - 1;
//			mainAccountNumber = listAccountNumber.get(accountNumberIndex);	
//		}
//	} catch (SQLException e){
//		System.err.println("SQLException");
//	} catch (Exception e){
//		System.err.println("Exception");
//	}
//	return mainAccountNumber;
//}