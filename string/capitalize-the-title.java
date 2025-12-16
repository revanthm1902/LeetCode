class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            if (w.length() > 2) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1));
            } else {
                sb.append(w);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
