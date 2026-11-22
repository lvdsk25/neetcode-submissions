class Solution {

    public String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            result.append(str.length())
                  .append("#")
                  .append(str);
        }

        return result.toString();

    }

    public List<String> decode(String str) {
          List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find the delimiter
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the length of the original string
            int length = Integer.parseInt(str.substring(i, j));

            // Extract the original string
            String word = str.substring(j + 1, j + 1 + length);

            result.add(word);

            // Move to the next encoded string
            i = j + 1 + length;
        }

        return result;

    }
}
