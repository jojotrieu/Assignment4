package src.svg;

import java.util.ArrayList;
import java.util.List;

//-----------------------------------------------------------------------------

/**
 * Contents of an SVG file. 
 * @author cambolbro
 */
public class SVG
{
	private final List<element.Element> elements = new ArrayList<element.Element>();

	//-------------------------------------------------------------------------
	
	public List<element.Element> elements()
	{
		return elements;
	}
	
	//-------------------------------------------------------------------------

	public void clear()
	{
		elements.clear();
	}
	
	//-------------------------------------------------------------------------

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder();
		
		sb.append(elements.size() + " elements:\n");
		for (element.Element element : elements)
			sb.append(element + "\n");
		
		return sb.toString();
	}

	//-------------------------------------------------------------------------
	
}
