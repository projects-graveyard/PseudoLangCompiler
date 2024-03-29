/*
 * Copyright (C) 2018-2019  Dinu Blanovschi
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package variables;

public enum DATA_TYPE {
	LONG(8, "q"),
	INT(4, "l"),
	STRING(8, "q"),
	BOOL(1, "b"),
	SHORT_INT(2, "w"),
	POINTER(8, "q");
	public int bytesize;
	private String instrsuffix;

	DATA_TYPE(int bytesize, String instrsuffix) {
		this.bytesize = bytesize;
		this.instrsuffix = instrsuffix;
	}
}
