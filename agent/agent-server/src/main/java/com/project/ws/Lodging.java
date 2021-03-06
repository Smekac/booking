package com.project.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for lodging complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="lodging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="personsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="category" type="{http://bookingxml.com/soap-example}categoryOfLodging"/>
 *         &lt;element name="type" type="{http://bookingxml.com/soap-example}typeOfLodging"/>
 *         &lt;element ref="{http://bookingxml.com/soap-example}city"/>
 *         &lt;element name="priceLists">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://bookingxml.com/soap-example}priceList" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="agent" type="{http://bookingxml.com/soap-example}user"/>
 *         &lt;element name="comments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://bookingxml.com/soap-example}comment" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reservations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://bookingxml.com/soap-example}reservation" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ratingList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://bookingxml.com/soap-example}rating" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additionalServiceList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://bookingxml.com/soap-example}additionalService" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="imagesList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://bookingxml.com/soap-example}image" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lodging", propOrder = {
        "id",
        "title",
        "address",
        "details",
        "rating",
        "personsNumber",
        "category",
        "type",
        "city",
        "priceLists",
        "agent",
        "comments",
        "reservations",
        "ratingList",
        "additionalServiceList",
        "imagesList"
})
public class Lodging {

    protected long id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String details;
    protected double rating;
    protected int personsNumber;
    @XmlElement(required = true)
    protected CategoryOfLodging category;
    @XmlElement(required = true)
    protected TypeOfLodging type;
    @XmlElement(required = true)
    protected City city;
    @XmlElement(required = true)
    protected PriceLists priceLists;
    @XmlElement(required = true)
    protected User agent;
    @XmlElement(required = true)
    protected Comments comments;
    @XmlElement(required = true)
    protected Reservations reservations;
    @XmlElement(required = true)
    protected RatingList ratingList;
    @XmlElement(required = true)
    protected AdditionalServiceList additionalServiceList;
    @XmlElement(required = true)
    protected ImagesList imagesList;

    /**
     * Gets the value of the id property.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the details property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the rating property.
     */
    public double getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     */
    public void setRating(double value) {
        this.rating = value;
    }

    /**
     * Gets the value of the personsNumber property.
     */
    public int getPersonsNumber() {
        return personsNumber;
    }

    /**
     * Sets the value of the personsNumber property.
     */
    public void setPersonsNumber(int value) {
        this.personsNumber = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return possible object is
     * {@link CategoryOfLodging }
     */
    public CategoryOfLodging getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value allowed object is
     *              {@link CategoryOfLodging }
     */
    public void setCategory(CategoryOfLodging value) {
        this.category = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link TypeOfLodging }
     */
    public TypeOfLodging getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link TypeOfLodging }
     */
    public void setType(TypeOfLodging value) {
        this.type = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     * {@link City }
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value allowed object is
     *              {@link City }
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Gets the value of the priceLists property.
     *
     * @return possible object is
     * {@link PriceLists }
     */
    public PriceLists getPriceLists() {
        return priceLists;
    }

    /**
     * Sets the value of the priceLists property.
     *
     * @param value allowed object is
     *              {@link PriceLists }
     */
    public void setPriceLists(PriceLists value) {
        this.priceLists = value;
    }

    /**
     * Gets the value of the agent property.
     *
     * @return possible object is
     * {@link User }
     */
    public User getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     *
     * @param value allowed object is
     *              {@link User }
     */
    public void setAgent(User value) {
        this.agent = value;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return possible object is
     * {@link Comments }
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value allowed object is
     *              {@link Comments }
     */
    public void setComments(Comments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the reservations property.
     *
     * @return possible object is
     * {@link Reservations }
     */
    public Reservations getReservations() {
        return reservations;
    }

    /**
     * Sets the value of the reservations property.
     *
     * @param value allowed object is
     *              {@link Reservations }
     */
    public void setReservations(Reservations value) {
        this.reservations = value;
    }

    /**
     * Gets the value of the ratingList property.
     *
     * @return possible object is
     * {@link RatingList }
     */
    public RatingList getRatingList() {
        return ratingList;
    }

    /**
     * Sets the value of the ratingList property.
     *
     * @param value allowed object is
     *              {@link RatingList }
     */
    public void setRatingList(RatingList value) {
        this.ratingList = value;
    }

    /**
     * Gets the value of the additionalServiceList property.
     *
     * @return possible object is
     * {@link AdditionalServiceList }
     */
    public AdditionalServiceList getAdditionalServiceList() {
        return additionalServiceList;
    }

    /**
     * Sets the value of the additionalServiceList property.
     *
     * @param value allowed object is
     *              {@link AdditionalServiceList }
     */
    public void setAdditionalServiceList(AdditionalServiceList value) {
        this.additionalServiceList = value;
    }

    /**
     * Gets the value of the imagesList property.
     *
     * @return possible object is
     * {@link ImagesList }
     */
    public ImagesList getImagesList() {
        return imagesList;
    }

    /**
     * Sets the value of the imagesList property.
     *
     * @param value allowed object is
     *              {@link ImagesList }
     */
    public void setImagesList(ImagesList value) {
        this.imagesList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://bookingxml.com/soap-example}additionalService" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "additionalService"
    })
    public static class AdditionalServiceList {

        @XmlElement(required = true)
        protected List<AdditionalService> additionalService;

        /**
         * Gets the value of the additionalService property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalService property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalService().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdditionalService }
         */
        public List<AdditionalService> getAdditionalService() {
            if (additionalService == null) {
                additionalService = new ArrayList<AdditionalService>();
            }
            return this.additionalService;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://bookingxml.com/soap-example}comment" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "comment"
    })
    public static class Comments {

        @XmlElement(required = true)
        protected List<Comment> comment;

        /**
         * Gets the value of the comment property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Comment }
         */
        public List<Comment> getComment() {
            if (comment == null) {
                comment = new ArrayList<Comment>();
            }
            return this.comment;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://bookingxml.com/soap-example}image" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "image"
    })
    public static class ImagesList {

        @XmlElement(required = true)
        protected List<Image> image;

        /**
         * Gets the value of the image property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the image property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImage().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Image }
         */
        public List<Image> getImage() {
            if (image == null) {
                image = new ArrayList<Image>();
            }
            return this.image;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://bookingxml.com/soap-example}priceList" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "priceList"
    })
    public static class PriceLists {

        @XmlElement(required = true)
        protected List<PriceList> priceList;

        /**
         * Gets the value of the priceList property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceList property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceList().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceList }
         */
        public List<PriceList> getPriceList() {
            if (priceList == null) {
                priceList = new ArrayList<PriceList>();
            }
            return this.priceList;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://bookingxml.com/soap-example}rating" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "rating"
    })
    public static class RatingList {

        @XmlElement(required = true)
        protected List<Rating> rating;

        /**
         * Gets the value of the rating property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rating property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRating().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rating }
         */
        public List<Rating> getRating() {
            if (rating == null) {
                rating = new ArrayList<Rating>();
            }
            return this.rating;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://bookingxml.com/soap-example}reservation" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "reservation"
    })
    public static class Reservations {

        @XmlElement(required = true)
        protected List<Reservation> reservation;

        /**
         * Gets the value of the reservation property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservation property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservation().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation }
         */
        public List<Reservation> getReservation() {
            if (reservation == null) {
                reservation = new ArrayList<Reservation>();
            }
            return this.reservation;
        }

    }

}
