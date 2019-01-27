package reader;

import reader.criteria.*;
import reader.criteria.ContainsWord;

public class Main {

    public static void main(String[] args) {

        Criterion criterion = new EndsWithQuestionOrExclamationMark();

        System.out.println(criterion.complies("looksa"));
    }
}
