//de.vdheide.mp3: Access MP3 properties, ID3 and ID3v2 tags
//Copyright (C) 1999-2004 Jens Vonderheide <jens@vdheide.de>

/*
 * This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.vdheide.mp3;

/**
 * Used for text ID3v2 frames which do not support encoding. Supports get and
 * set operations
 */
public class TextFrameNoEncoding extends TextFrame {
	/**
	 * Creates a new TextFrameNoEncoding with a given content
	 * 
	 * @param id3v2 ID3v2 tag
	 * @param type Type of frame
	 * @param content TagContent to write
	 * @param use_compression Use compression?
	 * @exception TagFormatException If text content field is null
	 */
	public TextFrameNoEncoding(ID3v2 id3v2, String type, TagContent content,
			boolean use_compression) throws TagFormatException {
		super(false, id3v2, type, content, use_compression);
	}

	/**
	 * Read content from ID3v2 tag.
	 * 
	 * @param id3v2 ID3v2 tag to read from
	 * @param type Type of frame to read
	 * @return content of tag
	 * @exception FrameDamagedException If frame is damaged (e.g. too short)
	 */
	public static TagContent read(ID3v2 id3v2, String type)
			throws FrameDamagedException {
		return read(false, id3v2, type);
	}
}
