class Client{
	public static void main(String[] args) {
		EmpBean e = new EmpBean();
		e.seteid(555);
		e.setename("Dot");

		System.out.println(e.geteid());
		System.out.println(e.getename());
	}
}