package usingWeka;

import weka.classifiers.trees.J48;
import weka.classifiers.Evaluation;


public class EvalucationClass {

	public static void main(String[] args) throws Exception {
		 String[] options = new String[2];
		 options[0] = "-t";
		 options[1] = "/Users/renxin/Documents/workspace/RecommendationSystem/dataSet/weather.nominal.arff";
		 System.out.println(Evaluation.evaluateModel(new J48(), options));
	}

}
