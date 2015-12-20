package bloc.dictionary.api.model;

/**
 * Created by Austin on 12/19/2015.
 */
public class Word {

    private String title;
    private String pronunciation;
    private String definition;

    public Word(String title, String pronunciation, String definition){
        this.title = title;
        this.pronunciation = pronunciation;
        this.definition = definition;
    }

    public String getTitle(){
        return title;
    }

    public String getPronunciation(){
        return pronunciation;
    }

    public String getDefinition(){
        return definition;
    }
}
