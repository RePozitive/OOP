public class testAuthor {
	public static void main(String[] args) {
		Author a1 = new Author ("Duggie Johnes", "you@mail.ru", 'm');
		System.out.println(a1.toString());
		a1.setEmail("notyou@mail.ru");
		System.out.println(a1.toString() + "hi");
	}
}
