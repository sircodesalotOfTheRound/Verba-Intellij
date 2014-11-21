package com.verba.plugin.elements;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import com.verba.plugin.language.VerbaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by sircodesalot on 14/11/21.
 */
public class VerbaElementType extends IElementType {
  private VerbaElementType(@NotNull @NonNls String debugName) {
    super(debugName, VerbaLanguage.INSTANCE);
  }

  public static VerbaElementType WHITESPACE = new VerbaElementType("whitespace");
  public static VerbaElementType FUNCTION = new VerbaElementType("function");
  public static VerbaElementType VALUE = new VerbaElementType("value");
}
