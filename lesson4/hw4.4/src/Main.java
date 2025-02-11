public static ArrayList<String> createSpritz(ArrayList<String> array) {
    if (array == null) {
        return null;
    }
    // + 1
    ArrayList<String> splitArray = spliterator(array);
    // + 1
    for (int i = 0; i < splitArray.size(); i++) {
        // + 1
        StringBuilder spaces = new StringBuilder();
        // + 1
        int length = splitArray.get(i).length();
        if (length == 1) {
            spaces.append(" ".repeat(count(3)));
            splitArray.set(i, spaces + splitArray.get(i));
        } else if (length == 2 || length == 3 || length == 4 || length == 5) {
            spaces.append(" ".repeat(count(2)));
            splitArray.set(i, spaces + splitArray.get(i));
        } else if (length == 6 || length == 7 || Length == 8 || length == 9) {
            spaces.append(" ".repeat(count(1)));
            splitArray.set(i, spaces + splitArray.get(i));
        }
    }
    // + 1
    int redChar = 3;
    // + 1
    for (int i = 0; i < splitArray.size(); i++) {
        splitArray.set(i, createHTMLTags(redChar, splitArray.get(i)));
    }

    return splitArray;
}
