import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/*
 * SD2x Homework #3
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the method signatures!
 */
public class Analyzer {
	
	/*
	 * Implement this method in Part 1
	 */
	public static List<Sentence> readFile(String filename) throws FileNotFoundException {

		/* IMPLEMENT THIS METHOD! */
		System.out.println("reading file using buffered reader");

		List<Sentence> sentences = new ArrayList<>();

		List<String> lines = readFileIntoListStrings(filename);
		lines = lines.stream().filter(s -> !s.isEmpty())
                .filter(s -> !s.equals("\n"))
                .filter(s -> !s.equals(""))
                .filter(s -> !s.equals(" "))
                .collect(Collectors.toList());

		for (String line1: lines){

            int score;
		    try {
                score = Integer.parseInt(line1.substring(0,1));
                Sentence sentence = new Sentence(score, line1.substring(2));
                sentences.add(sentence);

            }
            catch (NumberFormatException ex){
                continue;
            }

        }

		//FIXME
		//pass strings in strings to Sentence objects
		return sentences; // this line is here only so this code will compile if you don't modify it

	}

	public static List<String> readFileIntoListStrings(String filename) throws FileNotFoundException {

	    /* IMPLEMENT THIS METHOD! */
        File f = new File(filename);
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readline = "";
        System.out.println("reading file using buffered reader");

        List<String> strings = new ArrayList<>();

        try {
            while ((readline = b.readLine()) != null){
                    //strings.add(readline);
                    strings.add(readline);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //FIXME
        //pass strings in strings to Sentence objects
        return strings; // this line is here only so this code will compile if you don't modify it

    }

	/*
	 * Implement this method in Part 2
	 */
	public static Set<Word> allWords(List<Sentence> sentences) {

		/* IMPLEMENT THIS METHOD! */
		
		return null; // this line is here only so this code will compile if you don't modify it

	}
	
	/*
	 * Implement this method in Part 3
	 */
	public static Map<String, Double> calculateScores(Set<Word> words) {

		/* IMPLEMENT THIS METHOD! */
		
		return null; // this line is here only so this code will compile if you don't modify it

	}
	
	/*
	 * Implement this method in Part 4
	 */
	public static double calculateSentenceScore(Map<String, Double> wordScores, String sentence) {

		/* IMPLEMENT THIS METHOD! */
		
		return 0; // this line is here only so this code will compile if you don't modify it

	}
	
	/*
	 * This method is here to help you run your program. Y
	 * You may modify it as needed.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		if (args.length == 0) {
			System.out.println("Please specify the name of the input file");
			System.exit(0);
		}
		String filename = args[0];
		System.out.print("Please enter a sentence: ");
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		in.close();
		List<Sentence> sentences = Analyzer.readFile(filename);
		Set<Word> words = Analyzer.allWords(sentences);
		Map<String, Double> wordScores = Analyzer.calculateScores(words);
		double score = Analyzer.calculateSentenceScore(wordScores, sentence);
		System.out.println("The sentiment score is " + score);
	}
}
