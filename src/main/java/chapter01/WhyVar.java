package chapter01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhyVar {


  public static void main(String[] args) {

    // Yes, the diamond operator is possible here, but we are illustrating var, not generics
    Map<String, List<Map<String, Integer>>> myWeirdMap = new HashMap<String, List<Map<String, Integer>>> ();
    var myWeirdMapWitVar = new HashMap<String, List<Map<String, Integer>>> ();


  }




}
