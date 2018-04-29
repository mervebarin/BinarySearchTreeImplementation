import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CreatingTree{
	
	public static void main(String[] args){
		NodeList nameNodeList = new NodeList();
		NodeList surnameNodeList = new NodeList();
		NodeList phoneNodeList = new NodeList();

		try{
			FileReader fr = new FileReader("database.txt");
			BufferedReader br = new BufferedReader(fr);
			
			FileReader fr2 = new FileReader("query.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				String name = sCurrentLine.split(" ")[0];
				String surname = sCurrentLine.split(" ")[1];
				String number = sCurrentLine.split(" ")[2];
				Node person = new Node(name,surname,number);
				Node person2 = new Node(name,surname,number);
				Node person3 = new Node(name,surname,number);
				
				nameNodeList.addByName(nameNodeList, person);
				surnameNodeList.addBySurname(surnameNodeList, person2);
				phoneNodeList.addByPhone(phoneNodeList, person3);
			}
			
			System.out.println("Printing Name BST");
			System.out.println();
			nameNodeList.printNodeList(nameNodeList);
			System.out.println("---------------------------------------------------------");
			System.out.println("Printing Surname BST");
			System.out.println();
			surnameNodeList.printNodeList(surnameNodeList);
			System.out.println("---------------------------------------------------------");
			System.out.println("Printing Phone BST");
			System.out.println();
			phoneNodeList.printNodeList(phoneNodeList);
			System.out.println("---------------------------------------------------------");
			
			String sCurrentLine2;
			while ((sCurrentLine2 = br2.readLine()) != null) {
				String typeOfOperation = sCurrentLine2.split(" ")[0];
				String name = sCurrentLine2.split(" ")[1];
				String surname = sCurrentLine2.split(" ")[2];
				String number = sCurrentLine2.split(" ")[3];
				Node person = new Node(name,surname,number);
				Node person2 = new Node(name,surname,number);
				Node person3 = new Node(name,surname,number);
				
				if(typeOfOperation.equalsIgnoreCase("delete")){
					nameNodeList.deleteByName(nameNodeList, person);
					surnameNodeList.deleteBySurname(surnameNodeList, person2);
					phoneNodeList.deleteByPhone(phoneNodeList, person3);
					
					System.out.println("Printing Name BST after deletion of "+person.getName());
					System.out.println();
					nameNodeList.printNodeList(nameNodeList);
					System.out.println("---------------------------------------------------------");
					System.out.println("Printing Surname BST after deletion of "+person.getName());
					System.out.println();
					surnameNodeList.printNodeList(surnameNodeList);
					System.out.println("---------------------------------------------------------");
					System.out.println("Printing Phone BST after deletion of "+person.getName());
					System.out.println();
					phoneNodeList.printNodeList(phoneNodeList);
					System.out.println("---------------------------------------------------------");
				}else if(typeOfOperation.equalsIgnoreCase("insert")){
					nameNodeList.addByName(nameNodeList, person);
					surnameNodeList.addBySurname(surnameNodeList, person2);
					phoneNodeList.addByPhone(phoneNodeList, person3);
					
					System.out.println("Printing Name BST after insertion of "+person.getName());
					System.out.println();
					nameNodeList.printNodeList(nameNodeList);
					System.out.println("---------------------------------------------------------");
					System.out.println("Printing Surname BST after insertion of "+person.getName());
					System.out.println();
					surnameNodeList.printNodeList(surnameNodeList);
					System.out.println("---------------------------------------------------------");
					System.out.println("Printing Phone BST after insertion of "+person.getName());
					System.out.println();
					phoneNodeList.printNodeList(phoneNodeList);
					System.out.println("---------------------------------------------------------");
				}				
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	public static void delete(ArrayList<Node> bst, Node person){
		
	}
}
