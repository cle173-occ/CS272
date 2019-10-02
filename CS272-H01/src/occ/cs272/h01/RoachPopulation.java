/**
z * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author <cle173>
 * @version <09/09/2019>
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "cle173";
    public static final String ASSIGNMENT = "H01-A";

        
        private int population;        
        
        public RoachPopulation(int population){
            this.population = population;
        }        
        
        public void breed() {
            population *= 2;
        }
        
        public void spray() {
            population = population - (population / 10);
        }
        
        public int getRoaches() {
            return population;
        }
}
    
    
    

