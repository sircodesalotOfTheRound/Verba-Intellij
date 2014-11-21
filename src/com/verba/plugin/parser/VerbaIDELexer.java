package com.verba.plugin.parser;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import com.verba.language.build.buildtools.Build;
import com.verba.language.parsing.VerbaMemoizingLexer;
import com.verba.language.parsing.codestream.StringBasedCodeStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaIDELexer extends Lexer {
  private VerbaMemoizingLexer lexer;

  @Override
  public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
    StringBasedCodeStream codeStream = new StringBasedCodeStream("codefile", buffer.toString());
    this.lexer = new VerbaMemoizingLexer("codefile", codeStream);
  }

  @Override
  public int getState() { return 0; }

  @Nullable
  @Override
  public IElementType getTokenType() { return null; }

  @Override
  public int getTokenStart() { return lexer.current().absolutePosition(); }

  @Override
  public int getTokenEnd() { return 0; }

  @Override
  public void advance() {
    if (lexer.notEOF()) {
      this.lexer.advance();
    }
  }

  @NotNull
  @Override
  public LexerPosition getCurrentPosition() { return null; }

  @Override
  public void restore(@NotNull LexerPosition position) {  }

  @NotNull
  @Override
  public CharSequence getBufferSequence() { return null; }

  @Override
  public int getBufferEnd() { return 0; }
}
