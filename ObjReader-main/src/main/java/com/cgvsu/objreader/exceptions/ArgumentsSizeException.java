package com.cgvsu.objreader.exceptions;
public class ArgumentsSizeException extends ObjReaderException {
    public ArgumentsSizeException(ArgumentsErrorType errorType, int lineIndex) {
        super("Too " + errorType.getTextValue() + " arguments.", lineIndex);
    }
}