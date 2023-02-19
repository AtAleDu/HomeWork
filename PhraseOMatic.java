public class PhraseOMatic {

	public static void main(String[] args) {
		String[] worldListOne = {"круглосуточный", "трех-звездный","30000 - фунтовый", "Взаимный", "Обоюдный выигрыш"};
		String[] worldListTwo = {"уполномоченный", "трудный", "чистый продукт", "орентированный", "центральный", "распределенный"};
		String[] worldListThree = {"процесс", "пункт рагрузки", "выход из положения", "тип структуры", "талант", "подход"};

		int oneLength = worldListOne.length;
		int twoLength = worldListOne.length;
		int threeLength = worldListOne.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String pharse = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];

		System.out.println("Все, что нам нужно, - это" + pharse);
	}	
}