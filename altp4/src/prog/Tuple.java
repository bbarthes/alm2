package prog;

public class Tuple <T,P>{
	private T name;
	private P value;


	public Tuple(T name, P valu) {
		super();
		this.name = name;
		this.value = valu;
	}
	public T getName() {
		return name;
	}

	public P getValue() {
		return value;
	}


}
