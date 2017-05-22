package gpacalculator;

/**
 * @author Logan Stack
 */
public class GPA {
    public double calculateGPA(String[] grade, String[] weight) {
        double gradePoints = 0;
        double[] gradeConversion = new double[7];
        int[] weightConversion = new int[7];
        int weightTotal = 0;
        //Convert each letter grade to a corresponding number grade
        for(int i=0; i<7; i++) {
            switch(grade[i]) {
                case "A":
                    gradeConversion[i] = 4.0;
                    break;
                case "A-":
                    gradeConversion[i] = 3.67;
                    break;
                case "B+":
                    gradeConversion[i] = 3.33;
                    break;
                case "B":
                    gradeConversion[i] = 3.0;
                    break;
                case "B-":
                    gradeConversion[i] = 2.67;
                    break;
                case "C+":
                    gradeConversion[i] = 2.33;
                    break;
                case "C":
                    gradeConversion[i] = 2.0;
                    break;
                case "D":
                    gradeConversion[i] = 1.0;
                    break;
                case "F":
                    gradeConversion[i] = 0.0;
                    break;
                default:
                    gradeConversion[i] = 0.0;
            }
        }
        //convert String to int for weight
        //parseInt is probably better here but this catches invalid input nicely
        for(int j=0; j<7; j++) {
            switch(weight[j]) {
                case "4":
                    weightConversion[j] = 4;
                    break;
                case "3":
                    weightConversion[j] = 3;
                    break;
                case "2":
                    weightConversion[j] = 2;
                    break;
                case "1":
                    weightConversion[j] = 1;
                    break;
                default:
                    weightConversion[j] = 0;
            }
        }
        //multiply the number grades by their credit weights
        for(int k=0; k<7; k++) {
            gradePoints += (gradeConversion[k] * weightConversion[k]);
        }
        //get the total number of credits taken
        for(int p=0; p<7; p++) {
            weightTotal += weightConversion[p];
        }
        
        return gradePoints / weightTotal;
    }
}
