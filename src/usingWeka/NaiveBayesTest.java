package usingWeka;



import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.classifiers.bayes.NaiveBayesUpdateable;

import java.io.File;

/**
 * This example trains NaiveBayes incrementally on data obtained
 * from the ArffLoader.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 */
public class NaiveBayesTest {

  /**
   * Expects an ARFF file as first argument (class attribute is assumed
   * to be the last attribute).
   *
   * @param args        the commandline arguments
   * @throws Exception  if something goes wrong
   */
  public static void main(String[] args) throws Exception {
    // load data
    ArffLoader loader = new ArffLoader();
//    loader.setFile(new File(args[0]));
    loader.setFile(new File("/Users/renxin/Documents/workspace/RecommendationSystem/dataSet/weather.nominal.arff"));
    
    
    Instances structure = loader.getStructure();
    structure.setClassIndex(structure.numAttributes() - 1); // @xr 制定最后一列是label或者activity

    // train NaiveBayes，@xr 或者这里可以随便写别的算法
    NaiveBayesUpdateable nb = new NaiveBayesUpdateable();
    nb.buildClassifier(structure);
    Instance current;
    while ((current = loader.getNextInstance(structure)) != null)
      nb.updateClassifier(current);

    // output generated model
    System.out.println(nb);
  }
}