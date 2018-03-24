/*
 * User.java
 *
 * Generated with Matisse Schema Definition Language 9.1.10
 * Generation date: Sat Mar 24 15:35:35 2018
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package FothabyCompany.FothabyApp;

import com.matisse.reflect.*;

/**
 * <code>UserOld</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class User extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.10
     * Generation Date: Sat Mar 24 15:35:35 2018
     */

    /*
     * Class variables and methods
     */

    /** Class <code>User</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("FothabyCompany.FothabyApp.User"));

    /**
     * Gets the <code>User</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public User(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected User(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(User.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, User.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(User.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, User.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'firstName' */

    /** Attribute <code>firstName</code> cache ID */
    private static int firstNameCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("firstName",CID));

    /**
     * Gets the <code>firstName</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getFirstNameAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(firstNameCID);
    }


    /**
     * Gets the <code>firstName</code> attribute value.
     * @return the value
     *
     * @see #setFirstName
     * @see #removeFirstName
     */
    public final String getFirstName() {
        return getString(getFirstNameAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>firstName</code> attribute value.
     * @param val the new value
     *
     * @see #getFirstName
     * @see #removeFirstName
     */
    public final void setFirstName(String val) {
        setString(getFirstNameAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>firstName</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getFirstName
     * @see #setFirstName
     */
    public final void removeFirstName() {
        removeValue(getFirstNameAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getFirstName
     * @see #setFirstName
     */
    public final boolean isFirstNameDefaultValue() {
        return isDefaultValue(getFirstNameAttribute(getMtDatabase()));
    }


    /* Attribute 'lastName' */

    /** Attribute <code>lastName</code> cache ID */
    private static int lastNameCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("lastName",CID));

    /**
     * Gets the <code>lastName</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getLastNameAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(lastNameCID);
    }


    /**
     * Gets the <code>lastName</code> attribute value.
     * @return the value
     *
     * @see #setLastName
     * @see #removeLastName
     */
    public final String getLastName() {
        return getString(getLastNameAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>lastName</code> attribute value.
     * @param val the new value
     *
     * @see #getLastName
     * @see #removeLastName
     */
    public final void setLastName(String val) {
        setString(getLastNameAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>lastName</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getLastName
     * @see #setLastName
     */
    public final void removeLastName() {
        removeValue(getLastNameAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getLastName
     * @see #setLastName
     */
    public final boolean isLastNameDefaultValue() {
        return isDefaultValue(getLastNameAttribute(getMtDatabase()));
    }


    /* Attribute 'username' */

    /** Attribute <code>username</code> cache ID */
    private static int usernameCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("username",CID));

    /**
     * Gets the <code>username</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getUsernameAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(usernameCID);
    }


    /**
     * Gets the <code>username</code> attribute value.
     * @return the value
     *
     * @see #setUsername
     * @see #removeUsername
     */
    public final String getUsername() {
        return getString(getUsernameAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>username</code> attribute value.
     * @param val the new value
     *
     * @see #getUsername
     * @see #removeUsername
     */
    public final void setUsername(String val) {
        setString(getUsernameAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>username</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getUsername
     * @see #setUsername
     */
    public final void removeUsername() {
        removeValue(getUsernameAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getUsername
     * @see #setUsername
     */
    public final boolean isUsernameDefaultValue() {
        return isDefaultValue(getUsernameAttribute(getMtDatabase()));
    }


    /* Attribute 'password' */

    /** Attribute <code>password</code> cache ID */
    private static int passwordCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("password",CID));

    /**
     * Gets the <code>password</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getPasswordAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(passwordCID);
    }


    /**
     * Gets the <code>password</code> attribute value.
     * @return the value
     *
     * @see #setPassword
     * @see #removePassword
     */
    public final String getPassword() {
        return getString(getPasswordAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>password</code> attribute value.
     * @param val the new value
     *
     * @see #getPassword
     * @see #removePassword
     */
    public final void setPassword(String val) {
        setString(getPasswordAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>password</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getPassword
     * @see #setPassword
     */
    public final void removePassword() {
        removeValue(getPasswordAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getPassword
     * @see #setPassword
     */
    public final boolean isPasswordDefaultValue() {
        return isDefaultValue(getPasswordAttribute(getMtDatabase()));
    }


    /* Attribute 'email' */

    /** Attribute <code>email</code> cache ID */
    private static int emailCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("email",CID));

    /**
     * Gets the <code>email</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getEmailAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(emailCID);
    }


    /**
     * Gets the <code>email</code> attribute value.
     * @return the value
     *
     * @see #setEmail
     * @see #removeEmail
     */
    public final String getEmail() {
        return getString(getEmailAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>email</code> attribute value.
     * @param val the new value
     *
     * @see #getEmail
     * @see #removeEmail
     */
    public final void setEmail(String val) {
        setString(getEmailAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>email</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getEmail
     * @see #setEmail
     */
    public final void removeEmail() {
        removeValue(getEmailAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getEmail
     * @see #setEmail
     */
    public final boolean isEmailDefaultValue() {
        return isDefaultValue(getEmailAttribute(getMtDatabase()));
    }


    /* Attribute 'createdDate' */

    /** Attribute <code>createdDate</code> cache ID */
    private static int createdDateCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("createdDate",CID));

    /**
     * Gets the <code>createdDate</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getCreatedDateAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(createdDateCID);
    }


    /**
     * Gets the <code>createdDate</code> attribute value.
     * @return the value
     *
     * @see #setCreatedDate
     * @see #removeCreatedDate
     */
    public final java.util.GregorianCalendar getCreatedDate() {
        return getTimestamp(getCreatedDateAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>createdDate</code> attribute value.
     * @param val the new value
     *
     * @see #getCreatedDate
     * @see #removeCreatedDate
     */
    public final void setCreatedDate(java.util.GregorianCalendar val) {
        setTimestamp(getCreatedDateAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>createdDate</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getCreatedDate
     * @see #setCreatedDate
     */
    public final void removeCreatedDate() {
        removeValue(getCreatedDateAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getCreatedDate
     * @see #setCreatedDate
     */
    public final boolean isCreatedDateDefaultValue() {
        return isDefaultValue(getCreatedDateAttribute(getMtDatabase()));
    }


    /* Attribute 'userType' */

    /** Attribute <code>userType</code> cache ID */
    private static int userTypeCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("userType",CID));

    /**
     * Gets the <code>userType</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getUserTypeAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(userTypeCID);
    }


    /**
     * Gets the <code>userType</code> attribute value.
     * @return the value
     *
     * @see #setUserType
     * @see #removeUserType
     */
    public final String getUserType() {
        return getString(getUserTypeAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>userType</code> attribute value.
     * @param val the new value
     *
     * @see #getUserType
     * @see #removeUserType
     */
    public final void setUserType(String val) {
        setString(getUserTypeAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>userType</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getUserType
     * @see #setUserType
     */
    public final void removeUserType() {
        removeValue(getUserTypeAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getUserType
     * @see #setUserType
     */
    public final boolean isUserTypeDefaultValue() {
        return isDefaultValue(getUserTypeAttribute(getMtDatabase()));
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public User(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[User]";
    }
}
