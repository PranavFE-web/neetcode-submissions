class Solution {
    public boolean isPathCrossing(String path) {

        HashSet<String> set = new HashSet<>();

        int x = 0;
        int y = 0;

        set.add(x + "," + y);

        for (char c : path.toCharArray()) {

            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            }

            String position = x + "," + y;

            if (set.contains(position)) {
                return true;
            }

            set.add(position);
        }

        return false;
    }
}