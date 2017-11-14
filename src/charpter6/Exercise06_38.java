package charpter6;

public class Exercise06_38 {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 10 == 0)
        System.out.println(RandomCharacter.getRandomCharacter('A', 'Z'));
      else
        System.out.print(RandomCharacter.getRandomCharacter('A', 'Z'));
    }

    for (int i = 1; i <= 100; i++) {
      if (i % 10 == 0)
        System.out.println(RandomCharacter.getRandomCharacter('0', '9'));
      else
        System.out.print(RandomCharacter.getRandomCharacter('0', '9'));
    }
  }
}
class RandomCharacter{
	public static char getRandomCharacter(char ch1,char ch2){
		return (char)(ch1+Math.random()*(ch2-ch1+1));
	}
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a', 'z');
	}
	public static char getRandomUpperCaseLetter(){
		return getRandomCharacter('A', 'Z');
	}
	public static char getRandomDitigalCharacter(){
		return getRandomCharacter('0', '9');
	}
	public static char getRandomCharacter(){
		return getRandomCharacter('\u0000', '\uffff');
	}
}
