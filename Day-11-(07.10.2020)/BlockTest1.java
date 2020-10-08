class Block{
	//constructor
	Block(){
		System.out.println("Constructur");
	}

	//instance initializer block
	{
		System.out.println("Initializer block");
	}

	//static block
	static{
		System.out.println("static block");
	}
}
public class BlockTest{
	public static void main(String args[]){
		new Block();//object of class Block
	}
}