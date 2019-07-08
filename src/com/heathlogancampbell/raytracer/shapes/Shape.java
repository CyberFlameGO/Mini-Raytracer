package com.heathlogancampbell.raytracer.shapes;

import com.heathlogancampbell.raytracer.ray.IntersectionLog;
import com.heathlogancampbell.raytracer.utils.Vector3f;

public abstract class Shape 
{
	protected Vector3f point;

	public Shape(Vector3f point) 
	{
		this.point = point;
	}
	
	public abstract boolean intersection(IntersectionLog intersectionLog);
}
