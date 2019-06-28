/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa5;

/**
 *
 * @author kritikasenthil
 */
public class PA5 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        if (args == null) {
            throw new Exception();
        }

        if (args.length != 2) {
            throw new Exception();
        }
        JaccardIndexFinder jaccardIndexFinder=new JaccardIndexFinder(args[0], args[1]);
        jaccardIndexFinder.output();
        
        /*
        make sure the strings are not null
        make sure there are two
        pass the two filenames into a new object of type JaccardIndexFinder
         */
    }

}
