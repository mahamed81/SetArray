public class BagSetTester {

	public static void main(String[] args) {

		SetBag s1 = new SetBag(6);
		SetBag s2 = new SetBag(6);
		SetBag s3 = new SetBag(6);




		s1.add("hat");
		s1.add("shoes");
		s1.add("shirt");

		s3.add("hat");
		s3.add("shoes");
		s3.add("shirt");

		s2.add("cat");
		s2.add("drink");
		s2.add("fun");


		System.out.println("Set s2:  " + s2);
		System.out.println("Set s1: "+ s1);
		System.out.println(" ---------The union method prints the all the methods from both sets---------------" );
		System.out.println(s2.union(s1));
		
		System.out.println(" ---------The intersection method prints the common elements from both sets---------------" );
		System.out.println(s1.intersection(s3));


		System.out.println(" ---------The cuurent elements in set 1---------------" );
		System.out.println(s1);

		System.out.println(" ---------It will print out hat---------------" );
		System.out.println(( s1.getFirst()));

		System.out.println(" ---------It will print out true---------------" );
		System.out.println(s1.contains("shoes"));
		System.out.println("False: " + s1.contains("shana"));

		System.out.println(" ---------It will remove shoes---------------" );
		System.out.println(s1.remove("shoes"));

		System.out.println(" ---------It will print out 3 for the count_of _object---------------" );
		System.out.println(s2.count_of_objects());






	}

}
