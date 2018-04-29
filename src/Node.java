
public class Node {

	private String name;
	private String surname;
	private String number;
	private int place; //Place indicates the index of the node in BST. Root index is 0.
	private Node leftNode;
	private Node rightNode;
	private Node parent;

	public Node(String name, String surname, String number){
		this.name=name;
		this.surname=surname;
		this.number=number;
		this.place = -1;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}
	public Node getLeftNode() {
		return leftNode;
	}


	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}


	public Node getRightNode() {
		return rightNode;
	}


	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	public Node getParent(){
		return parent;
	}
	public void setParent(Node parent){
		this.parent=parent;
	}

	
}
