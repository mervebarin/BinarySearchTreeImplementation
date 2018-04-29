
public class NodeList {

	private Node root = null; 
	private Node child = null;
	private int size = 0;

	public void addByName(NodeList nList, Node n){
		setChild(n);
		if(nList.getRoot() != null){
			if(nList.getRoot().getName().compareToIgnoreCase(child.getName()) > 0){
				if(nList.getRoot().getLeftNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getLeftNode());
					nLi.getRoot().setPlace(nList.getRoot().getPlace()*2+1);
					addByName(nLi,child);
				}else{
					nList.getRoot().setLeftNode(child);
					child.setParent(nList.getRoot());
					child.setPlace(nList.getRoot().getPlace()*2+1); 
					size++;
				}
			}else if(nList.getRoot().getName().compareToIgnoreCase(n.getName()) < 0){
				if(nList.getRoot().getRightNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getRightNode());
					nLi.getRoot().setPlace(nList.getRoot().getPlace()*2+2);
					addByName(nLi,child);
				}else{
					nList.getRoot().setRightNode(child);
					child.setParent(nList.getRoot());
					child.setPlace(nList.getRoot().getPlace()*2+2); 
					size++;
				}
			}
		}else{
			nList.setRoot(child);
			child.setParent(null);
			child.setPlace(0);
			size++;
		}
	}
	public void addBySurname(NodeList nList, Node n){
		setChild(n);
		if(nList.getRoot() != null){
			if(nList.getRoot().getSurname().compareToIgnoreCase(child.getSurname()) > 0){
				if(nList.getRoot().getLeftNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getLeftNode());
					nLi.getRoot().setPlace(nList.getRoot().getPlace()*2+1);
					addBySurname(nLi,child);
				}else{
					nList.getRoot().setLeftNode(child);
					child.setParent(nList.getRoot());
					child.setPlace(nList.getRoot().getPlace()*2+1); 
					size++;
				}
			}else if(nList.getRoot().getSurname().compareToIgnoreCase(child.getSurname()) < 0){
				if(nList.getRoot().getRightNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getRightNode());
					nLi.getRoot().setPlace(nList.getRoot().getPlace()*2+2);
					addBySurname(nLi,child);
				}else{
					nList.getRoot().setRightNode(child);
					child.setParent(nList.getRoot());
					child.setPlace(nList.getRoot().getPlace()*2+2); 
					size++;
				}
			}
		}else{
			nList.setRoot(child);
			child.setParent(null);
			child.setPlace(0);
			size++;
		}
	}
	public void addByPhone(NodeList nList, Node n){
		setChild(n);
		if(nList.getRoot() != null){
			if(nList.getRoot().getNumber().compareToIgnoreCase(child.getNumber()) > 0){
				if(nList.getRoot().getLeftNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getLeftNode());
					nLi.getRoot().setPlace(nList.getRoot().getPlace()*2+1);
					addByPhone(nLi,child);
				}else{
					nList.getRoot().setLeftNode(child);
					child.setParent(nList.getRoot());
					child.setPlace(nList.getRoot().getPlace()*2+1); 
					size++;
				}
			}else if(nList.getRoot().getNumber().compareToIgnoreCase(child.getNumber()) < 0){
				if(nList.getRoot().getRightNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getRightNode());
					nLi.getRoot().setPlace(nList.getRoot().getPlace()*2+2);
					addByPhone(nLi,child);
				}else{
					nList.getRoot().setRightNode(child);
					child.setParent(nList.getRoot());
					child.setPlace(nList.getRoot().getPlace()*2+2); 
					size++;
				}
			}
		}else{
			nList.setRoot(child);
			child.setParent(null);
			child.setPlace(0);
			size++;
		}
	}

	public void deleteByName(NodeList nList, Node n){
		setChild(n);
		if(nList.getRoot() != null){
			if(nList.getRoot().getName().compareToIgnoreCase(child.getName()) > 0){
				if(nList.getRoot().getLeftNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getLeftNode());
					deleteByName(nLi,child);
				}else{
					System.out.println("Node could not found.");
				}
			}else if(nList.getRoot().getName().compareToIgnoreCase(child.getName()) < 0){
				if(nList.getRoot().getRightNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getRightNode());
					deleteByName(nLi,child);
				}else{
					System.out.println("Node could not found.");
				}
			}else if(nList.getRoot().getName().compareToIgnoreCase(child.getName()) == 0){
				Node toBeDeleted = nList.getRoot();
				NodeList nd = new NodeList();
				nd.setRoot(toBeDeleted);
				Node replacement = findNextGreatestNode(nd);
				
				toBeDeleted.setName(replacement.getName());
				toBeDeleted.setSurname(replacement.getSurname());
				toBeDeleted.setNumber(replacement.getNumber());
				if(replacement.getLeftNode() != null){
					toBeDeleted.setLeftNode(replacement.getLeftNode());
					toBeDeleted.getLeftNode().setPlace(toBeDeleted.getPlace()*2+1);
				}
				if(replacement.getRightNode() != null){
					toBeDeleted.setRightNode(replacement.getRightNode());
					toBeDeleted.getRightNode().setPlace(toBeDeleted.getPlace()*2+2);
				}
				if(replacement.getParent().getLeftNode() == replacement){
					replacement.getParent().setLeftNode(null);
				}else if(replacement.getParent().getRightNode() == replacement){
					replacement.getParent().setRightNode(null);
				}
				replacement.setName(null);
				replacement.setSurname(null);
				replacement.setNumber(null);
				replacement.setLeftNode(null);
				replacement.setRightNode(null);
				replacement.setParent(null);
				replacement.setPlace(-1);
			}
		}else{
			System.out.println("Node could not found.");
		}
	}
	public void deleteBySurname(NodeList nList, Node n){
		setChild(n);
		if(nList.getRoot() != null){
			if(nList.getRoot().getSurname().compareToIgnoreCase(child.getSurname()) > 0){
				if(nList.getRoot().getLeftNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getLeftNode());
					deleteBySurname(nLi,child);
				}else{
					System.out.println("Node could not found.");
				}
			}else if(nList.getRoot().getSurname().compareToIgnoreCase(child.getSurname()) < 0){
				if(nList.getRoot().getRightNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getRightNode());
					deleteBySurname(nLi,child);
				}else{
					System.out.println("Node could not found.");
				}
			}else if(nList.getRoot().getSurname().compareToIgnoreCase(child.getSurname()) == 0){
				Node toBeDeleted = nList.getRoot();
				NodeList nd = new NodeList();
				nd.setRoot(toBeDeleted);
				Node replacement = findNextGreatestNode(nd);
				
				toBeDeleted.setName(replacement.getName());
				toBeDeleted.setSurname(replacement.getSurname());
				toBeDeleted.setNumber(replacement.getNumber());
				if(replacement.getLeftNode() != null){
					toBeDeleted.setLeftNode(replacement.getLeftNode());
					toBeDeleted.getLeftNode().setPlace(toBeDeleted.getPlace()*2+1);
				}
				if(replacement.getRightNode() != null){
					toBeDeleted.setRightNode(replacement.getRightNode());
					toBeDeleted.getRightNode().setPlace(toBeDeleted.getPlace()*2+2);
				}
				if(replacement.getParent().getLeftNode() == replacement){
					replacement.getParent().setLeftNode(null);
				}else if(replacement.getParent().getRightNode() == replacement){
					replacement.getParent().setRightNode(null);
				}
				replacement.setName(null);
				replacement.setSurname(null);
				replacement.setNumber(null);
				replacement.setLeftNode(null);
				replacement.setRightNode(null);
				replacement.setParent(null);
				replacement.setPlace(-1);
			}
		}else{
			System.out.println("Node could not found.");
		}
	}
	public void deleteByPhone(NodeList nList, Node n){
		setChild(n);
		if(nList.getRoot() != null){
			if(nList.getRoot().getNumber().compareToIgnoreCase(child.getNumber()) > 0){
				if(nList.getRoot().getLeftNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getLeftNode());
					deleteByPhone(nLi,child);
				}else{
					System.out.println("Node could not found.");
				}
			}else if(nList.getRoot().getNumber().compareToIgnoreCase(child.getNumber()) < 0){
				if(nList.getRoot().getRightNode() != null){
					NodeList nLi = new NodeList();
					nLi.setRoot(nList.getRoot().getRightNode());
					deleteByPhone(nLi,child);
				}else{
					System.out.println("Node could not found.");
				}
			}else if(nList.getRoot().getNumber().compareToIgnoreCase(child.getNumber()) == 0){
				Node toBeDeleted = nList.getRoot();
				NodeList nd = new NodeList();
				nd.setRoot(toBeDeleted);
				Node replacement = findNextGreatestNode(nd);
				
				toBeDeleted.setName(replacement.getName());
				toBeDeleted.setSurname(replacement.getSurname());
				toBeDeleted.setNumber(replacement.getNumber());
				if(replacement.getLeftNode() != null){
					toBeDeleted.setLeftNode(replacement.getLeftNode());
					toBeDeleted.getLeftNode().setPlace(toBeDeleted.getPlace()*2+1);
				}
				if(replacement.getRightNode() != null){
					toBeDeleted.setRightNode(replacement.getRightNode());
					toBeDeleted.getRightNode().setPlace(toBeDeleted.getPlace()*2+2);
				}
				if(replacement.getParent().getLeftNode() == replacement){
					replacement.getParent().setLeftNode(null);
				}else if(replacement.getParent().getRightNode() == replacement){
					replacement.getParent().setRightNode(null);
				}
				replacement.setName(null);
				replacement.setSurname(null);
				replacement.setNumber(null);
				replacement.setLeftNode(null);
				replacement.setRightNode(null);
				replacement.setParent(null);
				replacement.setPlace(-1);
			}
		}else{
			System.out.println("Node could not found.");
		}
	}
	public void printNodeList(NodeList nList){
		if(nList.getRoot() != null){
			Node n = nList.getRoot();
			if(n.getName() != null){
				System.out.println(n.getName() +" "+n.getSurname()+" "+n.getNumber()+" Place: "+n.getPlace());
			}
			if(n.getLeftNode() != null){
				NodeList nL = new NodeList();
				nL.setRoot(n.getLeftNode());
				printNodeList(nL);
			}
			if(n.getRightNode() != null) {
				NodeList nR = new NodeList();
				nR.setRoot(n.getRightNode());
				printNodeList(nR);
			}
		}else{
			System.out.println("Empty NodeList");
		}
	}
	
	public Node findNextGreatestNode(NodeList nList){
		Node nextGreatest;
		if(nList.getRoot().getRightNode() != null){
			nextGreatest = nList.getRoot().getRightNode();
			NodeList n = new NodeList();
			n.setRoot(nextGreatest);
			findNextGreatestNode(n);
		}else if(nList.getRoot().getLeftNode() != null){
			nextGreatest = nList.getRoot().getLeftNode();
			NodeList n = new NodeList();
			n.setRoot(nextGreatest);
			findNextGreatestNode(n);
		}else {
			nextGreatest = nList.getRoot();
		}
		return nextGreatest;
	}
	public Node getRoot(){

		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size=size;
	}
	public Node getChild(){

		return child;
	}
	public void setChild(Node child){
		this.child = child;
	}

	public NodeList(){

	}	
}
