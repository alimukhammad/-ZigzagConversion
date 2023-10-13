public String convert(String s, int numRows) {
    if (numRows == 1 || numRows >= s.length()) {
        return s;
    }

    StringBuilder[] rows = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
        rows[i] = new StringBuilder();
    }

    int row = 0;
    int step = 1;

    for (char c : s.toCharArray()) {
        rows[row].append(c);
        if (row == 0) {
            step = 1;
        } else if (row == numRows - 1) {
            step = -1;
        }
        row += step;
    }

    StringBuilder result = new StringBuilder();
    for (StringBuilder r : rows) {
        result.append(r);
    }
    return result.toString();
}
