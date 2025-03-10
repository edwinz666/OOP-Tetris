package src;

import ch.aplu.jgamegrid.Location;

public class P extends FiveBlockTetrisPiece{
    private static final int blockId = 8;
    private static final String blockName = "P";

    P(Tetris tetris)
    {
        super(blockId, blockName, tetris);

        this.tetris = tetris;
        // rotId 0
        r[0][0] = new Location(new Location(0, -1));
        r[1][0] = new Location(new Location(1, -1));
        r[2][0] = new Location(new Location(0, 0));
        r[3][0] = new Location(new Location(1, 0));
        r[4][0] = new Location(new Location(0, 1));
        // rotId 1
        r[0][1] = new Location(new Location(0, -1));
        r[1][1] = new Location(new Location(1, -1));
        r[2][1] = new Location(new Location(0, 0));
        r[3][1] = new Location(new Location(1, 0));
        r[4][1] = new Location(new Location(-1, -1));
        // rotId 2
        r[0][2] = new Location(new Location(1, 1));
        r[1][2] = new Location(new Location(1, -1));
        r[2][2] = new Location(new Location(0, 0));
        r[3][2] = new Location(new Location(1, 0));
        r[4][2] = new Location(new Location(0, 1));
        // rotId 3
        r[0][3] = new Location(new Location(-1, 0));
        r[1][3] = new Location(new Location(-1, 1));
        r[2][3] = new Location(new Location(0, 0));
        r[3][3] = new Location(new Location(0, 1));
        r[4][3] = new Location(new Location(1, 1));

        for (int i = 0; i < r.length; i++)
            blocks.add(new TetroBlock(blockId, r[i]));
    }
}
