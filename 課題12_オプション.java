public class Client{
	public static void main(String[] args){
		Suuchi s = new Suuchi();
		Observer o1 = new NishinHyouji();
		Observer o2 = new JyuurokushinHyouji();
		
		s.attach(o1);
		s.attach(o2);
		int i = 0;
		while (i<100){
			s.putValue(i);
			i +=(int)(Mah.random()*30)-10;
		}
	}
}

abstract class Hyouji{
	abstract public void print(int n);
}

class Suuchi{
	int atai;
	
	public void setValue(int atai){
		this.atai = atai;
	}
	
	public int getValue(){
		return atai;
	}
}

class NishinHyouji extends Hyouji{
	public void print(int n){
		System.out.println(n +"");
	}
}

class JyuurokushinHyouji extends Hyouji{
	public void print(int n){
		System.out.println();
	}
}