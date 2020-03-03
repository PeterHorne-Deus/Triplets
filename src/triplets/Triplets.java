/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triplets;

import java.util.ArrayList;
/**
 *
 * @author pehor9164
 */
public class Triplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This program will use dynamic arrays
        ArrayList<String> nouns = new ArrayList<String>();
        nouns.add("cat");
        nouns.add("dog");
        nouns.add("horse");
        nouns.add("goat");
        nouns.add("eagle");
        nouns.add("lion");
        nouns.add("giraffe");

        ArrayList<String> verbs = new ArrayList<String>();
        verbs.add("ate");
        verbs.add("slept");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ran");
        verbs.add("tripped");
        verbs.add("guessed");
        verbs.add("tapped");

        ArrayList<String> rhymingNouns = new ArrayList<String>();
        rhymingNouns.add("mouse");
        rhymingNouns.add("blouse");
        rhymingNouns.add("grouse");
        rhymingNouns.add("house");
        rhymingNouns.add("spouse");
        rhymingNouns.add("doghouse");
        rhymingNouns.add("beachhouse");
        rhymingNouns.add("treehouse");
        
        //Creating a two demsional array list to hold my array lists
        ArrayList<ArrayList<String>> holder = new ArrayList<ArrayList<String>>();
        holder.add(nouns);
        holder.add(verbs);
        holder.add(rhymingNouns);

        String noun;
        String verb1, verb2, verb3;
        String rhymingNoun1, rhymingNoun2, rhymingNoun3;
        int randomNum;

        //get a random noun from the nouns array
        //use .size() to get the # of elements
        randomNum = (int) (Math.random() * nouns.size());
        noun = holder.get(0).get(randomNum);

        //get the first random verb from the verbs array &
        //remove from ArrayList
        randomNum = (int) (Math.random() * verbs.size());
        verb1 = holder.get(1).get(randomNum);
        verbs.remove(randomNum);

        //get the second random verb from verbs array and remove it
        randomNum = (int) (Math.random() * verbs.size());
        verb2 = holder.get(1).get(randomNum);
        verbs.remove(randomNum);
        
        //get the second random verb from verbs array and remove it
        randomNum = (int) (Math.random() * verbs.size());
        verb3 = holder.get(1).get(randomNum);
        verbs.remove(randomNum);
        
        
        //get the first rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun1 = holder.get(2).get(1);
        rhymingNouns.remove(randomNum);

        //get the second rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun2 = holder.get(2).get(4);
        rhymingNouns.remove(randomNum);
        
        //get the second rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun3 = holder.get(2).get(2);
        rhymingNouns.remove(randomNum);

        //Display the poem
        System.out.println("The " + noun + " " + verb1 + " a " + 
          rhymingNoun1 + "\n" + "And then " + verb2 + 
          " it in the " + rhymingNoun2 + "\nSince it " + verb3 +
          " its now a " + rhymingNoun3 );

    }
    
}
