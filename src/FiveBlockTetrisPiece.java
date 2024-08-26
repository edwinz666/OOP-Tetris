package src;

import ch.aplu.jgamegrid.Location;

public abstract class FiveBlockTetrisPiece extends TetrisPiece{
    public FiveBlockTetrisPiece(int blockId, String blockName, Tetris tetris) {
        super(blockId, blockName, new Location[5][4], tetris);
    }
}
