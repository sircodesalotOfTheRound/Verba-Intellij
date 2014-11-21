package com.verba.plugin.parser;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaIDELexer extends Lexer {
  private CharSequence buffer;

  @Override
  public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
    this.buffer = buffer;
  }

  @Override
  public int getState() { return 0; }

  @Nullable
  @Override
  public IElementType getTokenType() { return null; }

  @Override
  public int getTokenStart() { return 0; }

  @Override
  public int getTokenEnd() { return 0; }

  @Override
  public void advance() {  }

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
