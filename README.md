# heap-dump-analyzer
 Analyzing Heap Dump In high performance way


## Usage

```
./heap-dump-analyzer.sh --help
JVM heap dump hprof file analyzer

Usage: ./heap-dump-analyzer.sh [OPTIONS] --inputFile <inputFile>

Options:
  -i, --inputFile <inputFile>  binary hprof input file
  -t, --top <top>              the top results to display [default: 20]
  -l, --listStrings            list all Strings found
  -h, --help                   Print help
```


## Example


```
Top 100 allocated classes:

+------------+-----------+-------------+-----------------------------------------------------------+
| Total size | Instances | Class name                                                |
+------------+-----------+-------------+-----------------------------------------------------------+
|          298.69 MB |   5482827 | byte[]                                                      |
|          247.04 MB |   1425421 | java.lang.String[]                                          |
|          156.52 MB |   5470664 | java.lang.String                                            |
|          111.17 MB |   2649209 | java.util.HashMap$Node                                      |
|          107.39 MB |    479757 | java.util.HashMap$Node[]                                    |
|           42.71 MB |   1399648 | java.util.Collections$UnmodifiableRandomAccessList          |
|           42.70 MB |   1399348 | com.personetics.di.server.helper.DataFileExtractorCompRow   |
|           37.74 MB |   1413493 | java.util.Arrays$ArrayList                                  |
|           27.32 MB |    447554 | java.util.HashMap                                           |
|           26.97 MB |   1414011 | java.lang.Integer                                           |
|           24.99 MB |    436789 | java.util.LinkedHashMap$Entry                               |
|           11.00 MB |    221903 | org.ahocorasick.trie.PayloadState                           |
|            9.32 MB |    120640 | java.util.LinkedHashMap                                     |
|            9.05 MB |     64981 | java.lang.reflect.Method                                    |
|            8.22 MB |    359108 | java.util.HashMap$KeySet                                    |
|            8.14 MB |      2657 | short[]                                                     |
|            7.95 MB |     86807 | org.apache.commons.vfs2.provider.local.LocalFileName        |
|            6.76 MB |    161185 | java.util.concurrent.ConcurrentHashMap$Node                 |
|            5.19 MB |      8296 | com.personetics.entities.DACounterParty                     |
|            4.85 MB |     48015 | java.lang.Object[]                                          |
|            4.53 MB |     13507 | com.personetics.entities.RegionalKeyword                    |
|            4.13 MB |    135265 | java.util.Collections$SynchronizedSet                       |
|            4.05 MB |    177027 | java.util.HashSet                                           |
|            3.92 MB |     42403 | org.apache.commons.vfs2.provider.local.LocalFile            |
|            3.36 MB |     44048 | java.util.TreeMap                                           |
|            3.10 MB |      3271 | java.util.concurrent.ConcurrentHashMap$Node[]               |
|            2.99 MB |     27542 | java.lang.reflect.Field                                     |
|            2.84 MB |     21928 | com.personetics.entities.SMerchantEnrichment                |
|            2.81 MB |     51642 | java.util.TreeMap$Entry                                     |
|            2.80 MB |     45822 | java.lang.ref.Finalizer                                     |
|            2.74 MB |     51384 | java.lang.ref.SoftReference                                 |
|            2.28 MB |     34681 | org.apache.commons.vfs2.provider.DefaultFileContent         |
|            2.19 MB |     95847 | java.util.LinkedHashSet                                     |
|            2.17 MB |     29921 | com.google.gson.internal.LinkedTreeMap$Node                 |
|            2.16 MB |     24844 | int[]                                                       |
|            1.83 MB |     43719 | java.io.File                                                |
|            1.74 MB |     57080 | java.time.LocalDateTime                                     |
|            1.55 MB |     49552 | java.lang.Class[]                                           |
|            1.46 MB |     42403 | org.apache.commons.vfs2.cache.FileSystemAndNameKey          |
|            1.45 MB |     18942 | com.personetics.entities.SKnownMerchantsAndCitiesToBreak    |
|            1.43 MB |     18725 | com.personetics.entities.SCityNames                         |
|            1.29 MB |     42276 | org.ahocorasick.trie.Payload                                |
|            1.15 MB |      8296 | com.personetics.service.request.data.time.CurrentPDate      |
|            1.12 MB |     14726 | com.personetics.entities.SCityNamesToBreak                  |
|            1.03 MB |      8890 | java.lang.reflect.Constructor                               |
|            1.03 MB |      4114 | long[]                                                      |
|            1.00 MB |     43850 | java.util.TreeSet                                           |
|            1.00 MB |     32858 | java.util.ArrayList                                         |
|            0.93 MB |     34695 | java.lang.ThreadLocal$SuppliedThreadLocal                   |
|            0.92 MB |     60153 | java.lang.Object                                            |
|            0.83 MB |      8746 | java.util.concurrent.ConcurrentHashMap                      |
|            0.77 MB |      7450 | java.lang.Class$ReflectionData                              |
|            0.74 MB |     32223 | java.time.LocalDate                                         |
|            0.67 MB |      5846 | com.personetics.entities.IndicationMap                      |
|            0.64 MB |     28129 | com.google.gson.JsonPrimitive                               |
|            0.56 MB |      4929 | java.lang.reflect.Method[]                                  |
|            0.51 MB |      6648 | com.google.gson.internal.LinkedTreeMap                      |
|            0.51 MB |      8296 | com.personetics.entities.SSubscriptionCatalogId             |
|            0.48 MB |      7200 | org.apache.commons.vfs2.FileName[]                          |
|            0.45 MB |       555 | java.time.LocalDateTime[]                                   |
|            0.41 MB |      4476 | org.springframework.core.ResolvableType                     |
|            0.40 MB |     17390 | java.lang.Double                                            |
|            0.38 MB |      2374 | char[]                                                      |
|            0.36 MB |      1983 | com.personetics.entities.SParameter                         |
|            0.35 MB |      3875 | org.apache.commons.vfs2.provider.LayeredFileName            |
|            0.34 MB |      4498 | com.personetics.entities.SKnownMerchantsContains            |
|            0.33 MB |      5792 | java.lang.invoke.MemberName                                 |
|            0.32 MB |      8476 | com.personetics.entities.BEntity$AttributeInfo              |
|            0.32 MB |      4209 | com.personetics.entities.SKnownMerchantsToBreak             |
|            0.30 MB |      2114 | java.util.jar.JarFile$JarFileEntry                          |
|            0.30 MB |      7087 | java.util.Hashtable$Entry                                   |
|            0.30 MB |      9679 | java.util.regex.Pattern$CharPredicate$$Lambda$856+0x00000070011f92f0 |
|            0.27 MB |      1145 | java.time.ZoneOffset[]                                      |
|            0.26 MB |       875 | org.springframework.beans.factory.support.RootBeanDefinition |
|            0.26 MB |      4267 | java.lang.invoke.MethodType                                 |
|            0.25 MB |      8326 | org.joda.time.DateTime                                      |
|            0.25 MB |     12899 | java.util.regex.CharPredicates$$Lambda$874+0x00000070011ffa48 |
|            0.24 MB |      4178 | org.springframework.boot.context.properties.source.ConfigurationPropertyName$Elements |
|            0.23 MB |      3349 | org.springframework.boot.context.properties.source.ConfigurationPropertyName$ElementType[] |
|            0.22 MB |      1470 | java.util.WeakHashMap$Entry[]                               |
|            0.21 MB |      1617 | org.drools.mvel.MVELConstraint                              |
|            0.21 MB |      4286 | java.lang.invoke.MethodType$ConcurrentWeakInternSet$WeakEntry |
|            0.21 MB |      5141 | java.lang.CharSequence[]                                    |
|            0.20 MB |      4265 | java.lang.invoke.LambdaForm$Name                            |
|            0.20 MB |      8813 | java.util.jar.Attributes                                    |
|            0.20 MB |      2158 | com.personetics.entities.SDataModelAttribute                |
|            0.20 MB |      5189 | sun.reflect.annotation.AnnotationInvocationHandler          |
|            0.19 MB |      2549 | org.drools.core.io.impl.ByteArrayResource                   |
|            0.19 MB |      2306 | com.personetics.entities.DescriptionCompletionMapping       |
|            0.19 MB |      8296 | com.personetics.service.request.data.time.CurrentPDate$$Lambda$1803+0x0000007001c31158 |
|            0.19 MB |      8296 | com.personetics.service.request.data.time.CurrentPDate$$Lambda$1805+0x0000007001c315e8 |
|            0.19 MB |      8296 | com.personetics.service.request.data.time.CurrentPDate$$Lambda$1804+0x0000007001c313a0 |
|            0.19 MB |      4970 | jdk.internal.reflect.NativeConstructorAccessorImpl          |
|            0.19 MB |      3296 | org.antlr.runtime.CommonToken                               |
|            0.19 MB |      1623 | org.apache.commons.vfs2.provider.jar.JarFileObject          |
|            0.19 MB |      3269 | org.springframework.core.type.classreading.SimpleMethodMetadata |
|            0.18 MB |      4025 | java.lang.ref.WeakReference                                 |
|            0.18 MB |      7996 | java.util.LinkedHashMap$LinkedEntrySet                      |
|            0.18 MB |      1790 | com.personetics.vfs2.provider.truezip.zip.SecureZipFileObject |
|            0.18 MB |      4178 | org.springframework.boot.context.properties.source.ConfigurationPropertyName |
+------------+-----------+-------------+-----------------------------------------------------------+

```