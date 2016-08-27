package org.arrowhead.wp5.core.wrappers;

/*-
 * #%L
 * ARROWHEAD::WP5::Core Data Structures
 * %%
 * Copyright (C) 2016 The ARROWHEAD Consortium
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

public class FlexOfferKey {

	String ownId;
	String id;
	
	public FlexOfferKey(String ownId, String id){
		this.ownId = ownId;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String getOwnId() {
		return ownId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FlexOfferKey) {
			return ownId.equals(((FlexOfferKey) obj).ownId)
					&& id.equals(((FlexOfferKey) obj).id);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (ownId + id).hashCode();
	}
}
