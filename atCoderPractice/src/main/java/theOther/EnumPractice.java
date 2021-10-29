package theOther;

public class EnumPractice {

	public static void main(String[] args) {
		System.out.println(AnimalType.CAT.getLabel());
		System.out.println(AnimalType.DOG.cry());
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
