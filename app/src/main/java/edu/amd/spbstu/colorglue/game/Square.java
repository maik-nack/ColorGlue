package edu.amd.spbstu.colorglue.game;


class Square {
    static final int STATE_APPEAR = 0;
    static final int STATE_SIT = 1;
    static final int STATE_MOVE	= 2;
    static final int STATE_PULSE = 3;
    static final int STATE_REMOVED = 4;

    int _indexBitmap; // in _bitmapSquare[]
    int _state; // one of STATE_APPEAR, ...
    int _timeStart; // animation start time
    int _timeEnd; // animation end time
    int _cellSrc; // from cell
    int _cellDst; // to cell

    Square() {}

    Square(int indexBitmap, int cellSrc) {
        _indexBitmap = indexBitmap;
        _cellSrc = cellSrc;
    }

    Square(Square square) {
        _indexBitmap = square._indexBitmap;
        _state = square._state;
        _timeStart = square._timeStart;
        _timeEnd = square._timeEnd;
        _cellSrc = square._cellSrc;
        _cellDst = square._cellDst;
    }
}
