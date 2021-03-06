/*
 * Copyright (c) 2005 Einar Pehrson <einar@pehrson.nu>.
 *
 * This file is part of
 * CleanSheets - a spreadsheet application for the Java platform.
 *
 * CleanSheets is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * CleanSheets is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CleanSheets; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.yurkiss.antlr.eval.operators;


import org.yurkiss.antlr.eval.BinaryOperator;
import org.yurkiss.antlr.eval.Expression;
import org.yurkiss.antlr.eval.IllegalValueTypeException;
import org.yurkiss.antlr.eval.Value;

/**
 * An exponential operator for raising a numeric operand to the power of another.
 * @author Einar Pehrson
 */
public class Exponentiator implements BinaryOperator {

	/** The unique version identifier used for serialization */
	private static final long serialVersionUID = 6922027217525238297L;

	/**
	 * Creates a new exponential operator.
	 */
	public Exponentiator() {}

	public Value applyTo(Expression leftOperand, Expression rightOperand) throws IllegalValueTypeException {
		return new Value(Math.pow(
			leftOperand.evaluate().toDouble(),
			rightOperand.evaluate().toDouble()));
	}

	public String getIdentifier() {
		return "^";
	}

	public Value.Type getOperandValueType() {
		return Value.Type.NUMERIC;
	}

	public String toString() {
		return getIdentifier();
	}
}