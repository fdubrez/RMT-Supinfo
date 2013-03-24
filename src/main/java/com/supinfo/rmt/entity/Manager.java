package com.supinfo.rmt.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * @author Ahmad
 * @version $Id$
 */
@Entity
@DiscriminatorValue(value= "manager")
public class Manager extends User implements Serializable {
}
