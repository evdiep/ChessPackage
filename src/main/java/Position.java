public class Position {
    public int xPos;
    public int yPos;
    public String position;
    public Position(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
    public Position(String position) {
        //TODO validate bad entries
        this.position = position;
        PositionStringMapper positionMapper = new PositionStringMapper();
        this.xPos = positionMapper.getXpos(position.charAt(0));
        this.yPos = positionMapper.getYpos(position.charAt(1));
    }

    public int getXpos(){
        return xPos;
    }
    public int getYpos(){
        return yPos;
    }
    public String getStringPosition() {
        return position;
    }

    public static class PositionStringMapper {
        public PositionStringMapper() {
        }

        private int getXpos(char x) {
            switch (x) {
                case 'a':
                    return 0;
                case 'b':
                    return 1;
                case 'c':
                    return 2;
                case 'd':
                    return 3;
                case 'e':
                    return 4;
                case 'f':
                    return 5;
                case 'g':
                    return 6;
                case 'h':
                    return 7;
                default:
                    return -1;
            }
        }
        private int getYpos(char y) {
            switch (y) {
                case '1':
                    return 0;
                case '2':
                    return 1;
                case '3':
                    return 2;
                case '4':
                    return 3;
                case '5':
                    return 4;
                case '6':
                    return 5;
                case '7':
                    return 6;
                case '8':
                    return 7;
                default:
                    return -1;
            }
        }
    }
}
