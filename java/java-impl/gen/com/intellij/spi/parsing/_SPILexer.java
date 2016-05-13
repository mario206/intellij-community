/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.spi.parsing;

import com.intellij.psi.JavaTokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.spi.parsing.SPITokenType;
import com.intellij.lexer.FlexLexer;

@SuppressWarnings({"ALL"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_SPILexer.flex</tt>
 */
class _SPILexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\5\1\0\1\1\1\5\22\0\1\1\2\0\1\4"+
    "\1\6\11\0\1\7\1\0\12\3\7\0\32\2\4\0\1\2\1\0"+
    "\32\2\57\0\1\2\12\0\1\2\4\0\1\2\5\0\27\2\1\0"+
    "\37\2\1\0\376\2\4\0\36\2\70\0\131\2\7\0\11\2\2\0"+
    "\7\2\16\0\2\2\16\0\5\2\225\0\1\2\13\0\1\2\1\0"+
    "\3\2\1\0\1\2\1\0\24\2\1\0\54\2\1\0\7\2\3\0"+
    "\1\2\1\0\1\2\1\0\1\2\1\0\1\2\1\0\22\2\15\0"+
    "\14\2\1\0\102\2\1\0\14\2\1\0\44\2\16\0\65\2\2\0"+
    "\2\2\2\0\2\2\3\0\34\2\2\0\10\2\2\0\2\2\67\0"+
    "\46\2\2\0\1\2\7\0\47\2\110\0\33\2\5\0\3\2\56\0"+
    "\32\2\5\0\13\2\25\0\12\3\7\0\107\2\2\0\5\2\1\0"+
    "\17\2\1\0\4\2\1\0\1\2\17\0\2\2\11\0\12\3\u020b\0"+
    "\65\2\3\0\1\2\32\0\12\2\4\0\12\3\25\0\10\2\2\0"+
    "\2\2\2\0\26\2\1\0\7\2\1\0\1\2\3\0\4\2\42\0"+
    "\2\2\1\0\3\2\4\0\12\3\2\2\23\0\6\2\4\0\2\2"+
    "\2\0\26\2\1\0\7\2\1\0\2\2\1\0\2\2\1\0\2\2"+
    "\37\0\4\2\1\0\1\2\7\0\12\3\2\0\3\2\20\0\7\2"+
    "\1\0\1\2\1\0\3\2\1\0\26\2\1\0\7\2\1\0\2\2"+
    "\1\0\5\2\3\0\1\2\42\0\1\2\5\0\12\3\25\0\10\2"+
    "\2\0\2\2\2\0\26\2\1\0\7\2\1\0\2\2\2\0\4\2"+
    "\3\0\1\2\36\0\2\2\1\0\3\2\4\0\12\3\25\0\6\2"+
    "\3\0\3\2\1\0\4\2\3\0\2\2\1\0\1\2\1\0\2\2"+
    "\3\0\2\2\3\0\3\2\3\0\10\2\1\0\3\2\55\0\11\3"+
    "\25\0\10\2\1\0\3\2\1\0\27\2\1\0\12\2\1\0\5\2"+
    "\46\0\2\2\4\0\12\3\25\0\10\2\1\0\3\2\1\0\27\2"+
    "\1\0\12\2\1\0\5\2\44\0\1\2\1\0\2\2\4\0\12\3"+
    "\25\0\10\2\1\0\3\2\1\0\27\2\1\0\20\2\46\0\2\2"+
    "\4\0\12\3\221\0\56\2\1\0\1\2\1\0\2\2\14\0\7\2"+
    "\11\0\12\3\47\0\2\2\1\0\1\2\2\0\2\2\1\0\1\2"+
    "\2\0\1\2\6\0\4\2\1\0\7\2\1\0\3\2\1\0\1\2"+
    "\1\0\1\2\2\0\2\2\1\0\2\2\1\0\1\2\1\0\2\2"+
    "\11\0\1\2\2\0\5\2\1\0\1\2\11\0\12\3\2\0\2\2"+
    "\102\0\12\3\26\0\10\2\1\0\41\2\u0136\0\46\2\12\0\47\2"+
    "\11\0\132\2\5\0\104\2\5\0\122\2\u0c06\0\234\2\4\0\132\2"+
    "\6\0\26\2\2\0\6\2\2\0\46\2\2\0\6\2\2\0\10\2"+
    "\1\0\1\2\1\0\1\2\1\0\1\2\1\0\37\2\2\0\65\2"+
    "\1\0\7\2\1\0\1\2\3\0\3\2\1\0\7\2\3\0\4\2"+
    "\2\0\6\2\4\0\15\2\5\0\3\2\1\0\7\2\202\0\1\2"+
    "\202\0\1\2\4\0\1\2\2\0\12\2\1\0\1\2\2\0\6\2"+
    "\6\0\1\2\1\0\1\2\1\0\1\2\1\0\10\2\1\0\6\2"+
    "\u0ecc\0\1\2\53\0\5\2\13\0\124\2\6\0\4\2\2\0\132\2"+
    "\1\0\3\2\6\0\50\2\4\0\136\2\u1c71\0\u51a6\2\u0c5a\0\u2ba4\2"+
    "\u215c\0\u012e\2\322\0\7\2\14\0\5\2\7\0\12\2\1\0\15\2"+
    "\1\0\5\2\1\0\1\2\1\0\2\2\1\0\2\2\1\0\154\2"+
    "\41\0\u016b\2\22\0\100\2\2\0\66\2\50\0\14\2\164\0\3\2"+
    "\1\0\1\2\1\0\207\2\23\0\12\3\7\0\32\2\6\0\32\2"+
    "\13\0\131\2\3\0\6\2\2\0\6\2\2\0\6\2\2\0\3\2"+
    "\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[7];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\10\0\20\0\30\0\40\0\10\0\10";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[7];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\3\1\6\1\7"+
    "\11\0\1\3\3\0\1\3\4\0\2\4\4\0\5\5"+
    "\1\0\2\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[40];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[7];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _SPILexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _SPILexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 942) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return JavaTokenType.BAD_CHARACTER;
            }
          case 7: break;
          case 2: 
            { return JavaTokenType.WHITE_SPACE;
            }
          case 8: break;
          case 3: 
            { return SPITokenType.IDENTIFIER;
            }
          case 9: break;
          case 4: 
            { return JavaTokenType.END_OF_LINE_COMMENT;
            }
          case 10: break;
          case 5: 
            { return SPITokenType.DOLLAR;
            }
          case 11: break;
          case 6: 
            { return JavaTokenType.DOT;
            }
          case 12: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
