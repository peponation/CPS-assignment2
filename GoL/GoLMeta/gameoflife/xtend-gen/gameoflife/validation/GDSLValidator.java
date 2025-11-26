package gameoflife.validation;

import gameoflife.gDSL.Cell;
import gameoflife.gDSL.GDSLPackage;
import gameoflife.gDSL.Grid;
import gameoflife.gDSL.Rule;
import gameoflife.gDSL.Rules;
import java.util.HashSet;
import java.util.Objects;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class GDSLValidator extends AbstractGDSLValidator {
  @Check
  public void checkNeighborAmount(final Rule rule) {
    int _amount = rule.getAmount();
    boolean _greaterThan = (_amount > 8);
    if (_greaterThan) {
      this.error("A cell cannot have more than 8 neighbors.", 
        GDSLPackage.Literals.RULE__AMOUNT);
    }
  }

  @Check
  public void checkDuplicateCells(final Grid grid) {
    final HashSet<String> seenCoordinates = new HashSet<String>();
    int _size = grid.getCell().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Cell cell = grid.getCell().get((i).intValue());
        int _x = cell.getX();
        String _plus = (Integer.valueOf(_x) + ",");
        int _y = cell.getY();
        final String key = (_plus + Integer.valueOf(_y));
        boolean _contains = seenCoordinates.contains(key);
        if (_contains) {
          this.warning("Duplicate cell definition.", 
            GDSLPackage.Literals.GRID__CELL, (i).intValue());
        } else {
          seenCoordinates.add(key);
        }
      }
    }
  }

  @Check
  public void checkRuleConflicts(final Rules rules) {
    int _size = rules.getRules().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Rule ruleA = rules.getRules().get((i).intValue());
        int _size_1 = rules.getRules().size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(((i).intValue() + 1), _size_1, true);
        for (final Integer j : _doubleDotLessThan_1) {
          {
            final Rule ruleB = rules.getRules().get((j).intValue());
            if ((Objects.equals(ruleA.getOperator(), ruleB.getOperator()) && (ruleA.getAmount() == ruleB.getAmount()))) {
              gameoflife.gDSL.State _state = ruleA.getState();
              gameoflife.gDSL.State _state_1 = ruleB.getState();
              boolean _notEquals = (!Objects.equals(_state, _state_1));
              if (_notEquals) {
                this.error("Conflicting rule: cannot have different outcomes for the same condition.", 
                  GDSLPackage.Literals.RULES__RULES, (j).intValue());
              }
            }
          }
        }
      }
    }
  }
}
