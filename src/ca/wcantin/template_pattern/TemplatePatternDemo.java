package ca.wcantin.template_pattern;

/**
 * Created by William on 2017-06-20.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}