package src;

import ch.aplu.jgamegrid.Location;

public abstract class FourBlockTetrisPiece extends TetrisPiece{
    public FourBlockTetrisPiece(int blockId, String blockName, Tetris tetris) {
        super(blockId, blockName, new Location[4][4], tetris);
    }

}
