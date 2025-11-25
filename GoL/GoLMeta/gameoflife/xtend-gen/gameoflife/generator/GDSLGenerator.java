package gameoflife.generator;

import com.google.common.collect.Iterators;
import gameoflife.gDSL.Cell;
import gameoflife.gDSL.Compare;
import gameoflife.gDSL.GOL;
import gameoflife.gDSL.Rule;
import gameoflife.gDSL.State;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class GDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final GOL root = IteratorExtensions.<GOL>head(Iterators.<GOL>filter(resource.getAllContents(), GOL.class));
    if ((root != null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package GameOfLife;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.awt.Point;");
      _builder.newLine();
      _builder.append("import java.util.ArrayList;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class RulesOfLife {");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("/* * GENERATED METHOD: computeSurvivors");
      _builder.newLine();
      _builder.append("     ");
      _builder.append("* Based on DSL rules defined in: ");
      String _name = root.getName();
      _builder.append(_name, "     ");
      _builder.newLineIfNotEmpty();
      _builder.append("     ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public static void computeSurvivors(boolean[][] gameBoard, ArrayList<Point> survivingCells) {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("// Iterate through the array (leaving a 1-pixel border to avoid IndexOutOfBounds)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("for (int i=1; i<gameBoard.length-1; i++) {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("for (int j=1; j<gameBoard[0].length-1; j++) {");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("int surrounding = 0;");
      _builder.newLine();
      _builder.append("                ");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("// Count neighbors");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (gameBoard[i-1][j-1]) { surrounding++; }");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (gameBoard[i-1][j])   { surrounding++; }");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (gameBoard[i-1][j+1]) { surrounding++; }");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (gameBoard[i][j-1])   { surrounding++; }");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (gameBoard[i][j+1])   { surrounding++; }");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (gameBoard[i+1][j-1]) { surrounding++; }");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (gameBoard[i+1][j])   { surrounding++; }");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (gameBoard[i+1][j+1]) { surrounding++; }");
      _builder.newLine();
      _builder.newLine();
      _builder.append("                ");
      _builder.append("/* GENERATED RULES */");
      _builder.newLine();
      {
        EList<Rule> _rules = root.getRules().getRules();
        for(final Rule rule : _rules) {
          _builder.append("                ");
          String _compileRule = this.compileRule(rule);
          _builder.append(_compileRule, "                ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("            ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("/* * GENERATED METHOD: initializeGrid");
      _builder.newLine();
      _builder.append("     ");
      _builder.append("* Defines the initial state based on the DSL Grid");
      _builder.newLine();
      _builder.append("     ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public static void initializeGrid(ArrayList<Point> points) {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("points.clear();");
      _builder.newLine();
      {
        EList<Cell> _cell = root.getGrid().getCell();
        for(final Cell cell : _cell) {
          _builder.append("        ");
          _builder.append("points.add(new Point(");
          int _x = cell.getX();
          _builder.append(_x, "        ");
          _builder.append(", ");
          int _y = cell.getY();
          _builder.append(_y, "        ");
          _builder.append("));");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      fsa.generateFile("GameOfLife/RulesOfLife.java", _builder);
    }
  }

  public String compileRule(final Rule rule) {
    String currentStatusCheck = "";
    State _state = rule.getState();
    boolean _equals = Objects.equals(_state, State.LIVE);
    if (_equals) {
      currentStatusCheck = "gameBoard[i][j]";
    } else {
      State _state_1 = rule.getState();
      boolean _equals_1 = Objects.equals(_state_1, State.TO_ALIVE);
      if (_equals_1) {
        currentStatusCheck = "!gameBoard[i][j]";
      } else {
        return "";
      }
    }
    String operatorSymbol = "";
    Compare _operator = rule.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case LT:
          operatorSymbol = "<";
          break;
        case GT:
          operatorSymbol = ">";
          break;
        case EQ:
          operatorSymbol = "==";
          break;
        default:
          break;
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Rule: ");
    State _state_2 = rule.getState();
    _builder.append(_state_2);
    _builder.append(" if neighbors ");
    _builder.append(operatorSymbol);
    _builder.append(" ");
    int _amount = rule.getAmount();
    _builder.append(_amount);
    _builder.newLineIfNotEmpty();
    _builder.append("if ((");
    _builder.append(currentStatusCheck);
    _builder.append(") && (surrounding ");
    _builder.append(operatorSymbol);
    _builder.append(" ");
    int _amount_1 = rule.getAmount();
    _builder.append(_amount_1);
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("survivingCells.add(new Point(i-1, j-1));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
