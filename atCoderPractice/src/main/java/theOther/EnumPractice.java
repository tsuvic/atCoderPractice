package theOther;

import java.util.Arrays;

public class EnumPractice {


	public static void main(String[] args) {
		System.out.println(AnimalType.CAT.getLabel());
		System.out.println(AnimalType.DOG.cry());
		
		AnimalType animalType = AnimalType.DOG;
		switch (animalType) {
		case DOG:
			System.out.println("This is a DOG");
			break;
		case CAT:
			System.out.println("This is a CAT");	
			break;
		}
		
		if (AnimalType.valueOf("DOG").equals(AnimalType.DOG))
			System.out.println("The content is same");
		
		System.out.println(AnimalType.values());
		AnimalType[] array = AnimalType.values();
		Arrays.asList(array).stream().forEach(System.out::println);
		
		System.out.println(AnimalType.DOG.ordinal());
		
		System.out.println(AnimalType.DOG.compareTo(AnimalType.CAT));
		System.out.println(AnimalType.DOG.compareTo(AnimalType.DOG));
		
		System.out.println(AnimalType.DOG.name());

		System.out.println(AnimalType.DOG.toString());
		
		System.out.println(AnimalType.DOG.describeConstable());
		
		System.out.println(AnimalType.DOG.getClass());
		
		System.out.println(AnimalType.DOG.getDeclaringClass());
		
	}

	
	public enum AnimalType {
		DOG("犬", 1) {
			@Override
			public String cry() {
				return "Wan";
			}
		},
		CAT("猫", 2){
			@Override
			public String cry() {
				return "Nyan";
			}
		};

		private String label;
		private int id;

		private AnimalType(String label, int id) {
			this.label = label;
			this.id = id;
		}

		public String getLabel() {
			return label;
		}

		public int getId() {
			return id;
		}

		public abstract String cry();

	}

}
